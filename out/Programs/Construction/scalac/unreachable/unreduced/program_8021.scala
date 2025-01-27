package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[(Boolean,Byte)]], b: T_A, c: Byte) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_B, b: (Boolean,Boolean), c: CC_A) extends T_A
case class CC_D(a: CC_A) extends T_B[CC_A]
case class CC_E(a: Int, b: (T_B[CC_A],T_A), c: CC_C) extends T_B[CC_A]
case class CC_F(a: T_A) extends T_B[CC_A]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _, _)) => 0 
  case CC_B(CC_B(CC_A(_, _, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
  case CC_B(CC_B(CC_C(_, _, _))) => 3 
  case CC_B(CC_C(CC_B(_), (_,_), CC_A(_, _, _))) => 4 
}
}