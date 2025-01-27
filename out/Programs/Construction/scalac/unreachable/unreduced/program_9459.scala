package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: T_B[Int], c: T_A[T_B[Byte]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Boolean]]]
case class CC_C[C](a: T_B[C]) extends T_B[C]
case class CC_D[D](a: T_B[D], b: T_B[D], c: T_A[D]) extends T_B[D]
case class CC_E[E](a: (Boolean,Char)) extends T_B[E]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C(CC_C(_)), _) => 0 
  case CC_A(_, CC_C(CC_D(_, _, _)), _) => 1 
  case CC_A(_, CC_D(_, _, _), _) => 2 
  case CC_A(_, CC_E((_,_)), _) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: CC_A(_, CC_C(CC_E(_)), _)