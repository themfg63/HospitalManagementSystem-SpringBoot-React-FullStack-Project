import React from "react";
import SideBar from "../Components/SideBar/SideBar.tsx";
import Header from "../Components/Header/Header.tsx";
import { Outlet } from "react-router-dom";

const AdminDashboard = () => {
    return(
        <div className="flex">
            <SideBar />
            <div className="w-full flex flex-col">
                <Header />
                <Outlet />
            </div>
        </div>
    )
}

export default AdminDashboard;