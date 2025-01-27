package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: (T_A[T_B],T_B), c: T_B) extends T_A[T_B]
case class CC_B(a: T_B, b: CC_A, c: T_B) extends T_B
case class CC_C(a: Char, b: T_A[Int]) extends T_B
case class CC_D(a: T_B, b: T_A[((Boolean,Int),Byte)], c: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(CC_B(_, _, _), _, _) => 1 
  case CC_D(CC_C(_, _), _, _) => 2 
  case CC_D(CC_D(_, _, _), _, _) => 3 
}
}
// This is not matched: CC_C(_, _)