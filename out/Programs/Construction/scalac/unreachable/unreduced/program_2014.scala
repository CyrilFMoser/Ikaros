package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Boolean, Byte],T_A[Byte])) extends T_A[T_B[T_A[Char], T_B[Char, Char]]]
case class CC_B(a: T_A[(CC_A,CC_A)], b: Int, c: T_A[T_B[Byte, CC_A]]) extends T_A[T_B[T_A[Char], T_B[Char, Char]]]
case class CC_C(a: T_A[T_A[CC_B]], b: (T_B[CC_A, CC_B],CC_A)) extends T_A[T_B[T_A[Char], T_B[Char, Char]]]
case class CC_D(a: CC_A, b: CC_C) extends T_B[CC_B, CC_B]
case class CC_E[D](a: T_B[CC_B, CC_B], b: D, c: D) extends T_B[D, T_B[CC_B, CC_B]]

val v_a: T_A[T_B[T_A[Char], T_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, (_,CC_A(_)))