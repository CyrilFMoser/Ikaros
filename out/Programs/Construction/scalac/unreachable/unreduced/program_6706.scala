package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Byte]]) extends T_A[T_A[T_B[Char]]]
case class CC_B() extends T_A[T_A[T_B[Char]]]
case class CC_C() extends T_A[T_A[T_B[Char]]]
case class CC_D(a: CC_B) extends T_B[Char]
case class CC_E() extends T_B[Char]
case class CC_F() extends T_B[Char]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()