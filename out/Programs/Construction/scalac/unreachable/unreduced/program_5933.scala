package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: T_A[CC_B[Byte]], b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_A[T_A[T_B[Boolean, Byte]]]
case class CC_D(a: T_A[(CC_C,CC_C)], b: CC_B[CC_B[CC_C]]) extends T_B[Char, Boolean]
case class CC_E(a: CC_A[CC_A[Int]], b: T_A[CC_C], c: Boolean) extends T_B[Char, Boolean]

val v_a: T_A[T_A[T_B[Boolean, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_A(_), _, _) => 1 
  case CC_C(CC_B(), _, _) => 2 
}
}
// This is not matched: CC_B()