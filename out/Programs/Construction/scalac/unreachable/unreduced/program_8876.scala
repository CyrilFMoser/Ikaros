package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[T_A[(Char,Int), CC_A[Boolean]], T_A[(Char,Int), CC_A[Boolean]]], T_A[(Char,Int), CC_A[Boolean]]]
case class CC_C[D](a: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[T_A[(Char,Int), CC_A[Boolean]], T_A[(Char,Int), CC_A[Boolean]]], T_A[(Char,Int), CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_), _), _) => 2 
  case CC_A(_, CC_B(), _) => 3 
  case CC_A(_, CC_C(_), _) => 4 
  case CC_B() => 5 
  case CC_C(_) => 6 
}
}