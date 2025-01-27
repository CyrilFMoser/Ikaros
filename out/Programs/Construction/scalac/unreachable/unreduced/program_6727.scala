package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A() extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Boolean]], T_A[T_A[Char, Char], T_B[Char]]]
case class CC_B(a: T_A[(CC_A,CC_A), CC_A]) extends T_A[T_A[T_A[Char, Char], T_A[Boolean, Boolean]], T_A[T_A[Char, Char], T_B[Char]]]
case class CC_C(a: T_A[(CC_B,CC_B), (CC_B,CC_B)], b: CC_B) extends T_B[Byte]
case class CC_D(a: CC_B) extends T_B[Byte]
case class CC_E() extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_D(CC_B(_))