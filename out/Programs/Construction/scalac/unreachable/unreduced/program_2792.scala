package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: Int, c: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: (Int,Byte), c: T_A) extends T_A
case class CC_C(a: Int, b: CC_A, c: CC_B) extends T_A
case class CC_D(a: Int, b: T_A) extends T_B[CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)