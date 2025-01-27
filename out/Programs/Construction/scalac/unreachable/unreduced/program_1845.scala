package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D], c: T_B[T_A[D, D]]) extends T_A[D, Byte]
case class CC_B[E](a: (T_A[Boolean, Byte],(Byte,Char))) extends T_A[E, Byte]
case class CC_C(a: T_A[T_B[Int], CC_A[(Char,Char)]], b: Boolean, c: CC_B[T_A[(Char,Int), Byte]]) extends T_B[CC_A[T_B[Byte]]]
case class CC_D(a: CC_C, b: (T_B[Char],T_A[CC_C, Byte])) extends T_B[CC_A[T_B[Byte]]]
case class CC_E(a: T_B[CC_B[CC_D]]) extends T_B[CC_A[T_B[Byte]]]

val v_a: T_B[CC_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: CC_E(_)