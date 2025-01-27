package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_B[Char, Byte],T_A[Int]), b: Boolean, c: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C() extends T_A[T_B[T_A[Char], CC_B[Char]]]
case class CC_D[F](a: T_B[F, CC_A[F]], b: (T_A[CC_C],(CC_C,CC_C)), c: T_A[F]) extends T_B[F, CC_A[F]]
case class CC_E(a: CC_C, b: T_A[CC_C]) extends T_B[T_B[CC_B[CC_C], (CC_C,Int)], CC_A[T_B[CC_B[CC_C], (CC_C,Int)]]]

val v_a: T_A[T_B[T_A[Char], CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()