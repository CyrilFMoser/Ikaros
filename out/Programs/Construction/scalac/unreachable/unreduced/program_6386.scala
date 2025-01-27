package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, (T_B,T_A[(Char,Int), T_B])]
case class CC_B[D]() extends T_A[D, (T_B,T_A[(Char,Int), T_B])]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: T_A[Byte, (Boolean,T_B)], b: T_A[CC_B[CC_C], T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_, _)) => 1 
  case CC_D(_, _) => 2 
}
}