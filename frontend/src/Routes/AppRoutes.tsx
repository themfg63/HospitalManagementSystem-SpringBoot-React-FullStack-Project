import React from "react";
import {BrowserRouter, Route, Routes} from 'react-router-dom';
import Random from "../Components/SideBar/Random.tsx";
import AdminDashboard from "../Layout/AdminDashboard.tsx";


const AppRoutes = () => {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<AdminDashboard />}>
                    <Route path="/dashboard" element={<Random />} />
                    <Route path="/doctors" element={<Random />} />
                    <Route path="/appointments" element={<Random />} />
                    <Route path="/pharmacy" element={<Random />} />
                </Route>
            </Routes>
        </BrowserRouter>
    )
}

export default AppRoutes;