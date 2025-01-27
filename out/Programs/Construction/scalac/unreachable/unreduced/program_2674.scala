package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E]) extends T_A[(T_B[Char, Char],T_A[Byte, Char]), E]
case class CC_B[F](a: F) extends T_A[(T_B[Char, Char],T_A[Byte, Char]), F]
case class CC_C[G](a: T_A[G, G], b: T_A[G, G]) extends T_A[(T_B[Char, Char],T_A[Byte, Char]), G]
case class CC_D(a: T_A[CC_C[Int], CC_B[Boolean]], b: CC_B[CC_C[Int]], c: CC_A[(Char,Byte)]) extends T_B[T_B[CC_B[Char], T_B[Boolean, Boolean]], T_A[T_A[Int, Byte], CC_B[Char]]]
case class CC_E(a: (CC_A[CC_D],(CC_D,(Boolean,Int))), b: CC_D) extends T_B[T_B[CC_B[Char], T_B[Boolean, Boolean]], T_A[T_A[Int, Byte], CC_B[Char]]]
case class CC_F(a: T_A[Byte, (CC_E,CC_E)]) extends T_B[T_B[CC_B[Char], T_B[Boolean, Boolean]], T_A[T_A[Int, Byte], CC_B[Char]]]

val v_a: T_B[T_B[CC_B[Char], T_B[Boolean, Boolean]], T_A[T_A[Int, Byte], CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(CC_C(_, _)), _) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: CC_F(_)