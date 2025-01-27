package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: T_B[T_A[D], D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C(a: T_A[CC_B[(Boolean,Char)]], b: T_B[Char, (Boolean,(Boolean,Char))]) extends T_A[T_A[T_A[Char]]]
case class CC_D[F](a: (CC_A[CC_C],CC_A[CC_C]), b: T_A[F], c: CC_A[F]) extends T_B[Boolean, F]
case class CC_E[G]() extends T_B[Boolean, G]
case class CC_F() extends T_B[Boolean, T_B[Boolean, (CC_C,CC_C)]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(CC_A(_, _, _), CC_B(), _), _) => 1 
  case CC_A(_, CC_A(CC_B(), CC_A(_, _, _), _), _) => 2 
  case CC_A(_, CC_A(CC_B(), CC_B(), _), _) => 3 
  case CC_A(_, CC_B(), _) => 4 
  case CC_B() => 5 
  case CC_C(CC_A(_, CC_B(), _), _) => 6 
  case CC_C(CC_B(), _) => 7 
}
}