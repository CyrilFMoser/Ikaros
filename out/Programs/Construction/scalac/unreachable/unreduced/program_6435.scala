package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (Byte,(T_A,Byte)), b: T_B[T_A]) extends T_A
case class CC_B(a: CC_A, b: T_B[T_B[CC_A]], c: Int) extends T_A
case class CC_C(a: T_A, b: CC_A, c: (Boolean,T_A)) extends T_B[CC_B]
case class CC_D(a: T_B[CC_B], b: Byte, c: Byte) extends T_B[CC_B]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_A(_, _), _, (_,_)), _, _) => 0 
  case CC_D(CC_C(CC_B(_, _, _), _, (_,_)), _, _) => 1 
  case CC_D(CC_D(_, _, 0), _, _) => 2 
  case CC_D(CC_D(_, _, _), _, _) => 3 
}
}