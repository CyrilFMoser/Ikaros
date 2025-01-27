package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: Boolean, c: (Boolean,Boolean)) extends T_A[(T_B,T_B), Boolean]
case class CC_B(a: T_A[CC_A, T_B], b: T_B, c: (T_A[Int, T_B],Int)) extends T_A[(T_B,T_B), Boolean]
case class CC_C(a: T_B, b: T_B, c: T_A[(T_B,T_B), Boolean]) extends T_B
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: Boolean) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, CC_A(_, _, _)), true, (_,true)) => 0 
  case CC_A(CC_C(_, _, CC_B(_, _, _)), true, (_,true)) => 1 
  case CC_A(CC_D(CC_C(_, _, _)), true, (_,true)) => 2 
  case CC_A(CC_E(_), true, (_,true)) => 3 
  case CC_A(CC_C(_, _, CC_A(_, _, _)), false, (_,true)) => 4 
  case CC_A(CC_C(_, _, CC_B(_, _, _)), false, (_,true)) => 5 
  case CC_A(CC_D(CC_C(_, _, _)), false, (_,true)) => 6 
  case CC_A(CC_E(_), false, (_,true)) => 7 
  case CC_A(CC_C(_, _, CC_A(_, _, _)), true, (_,false)) => 8 
  case CC_A(CC_C(_, _, CC_B(_, _, _)), true, (_,false)) => 9 
  case CC_A(CC_D(CC_C(_, _, _)), true, (_,false)) => 10 
  case CC_A(CC_E(_), true, (_,false)) => 11 
  case CC_A(CC_C(_, _, CC_A(_, _, _)), false, (_,false)) => 12 
  case CC_A(CC_C(_, _, CC_B(_, _, _)), false, (_,false)) => 13 
  case CC_A(CC_D(CC_C(_, _, _)), false, (_,false)) => 14 
  case CC_A(CC_E(_), false, (_,false)) => 15 
}
}