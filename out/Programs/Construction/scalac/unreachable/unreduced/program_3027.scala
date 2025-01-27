package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]]
case class CC_C[D](a: T_A[T_A[D, D], D], b: T_A[D, T_A[D, D]]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_C(_, _), _) => 1 
  case CC_B() => 2 
  case CC_C(CC_A(_, _), _) => 3 
  case CC_C(CC_C(CC_A(_, _), _), _) => 4 
  case CC_C(CC_C(CC_B(), _), _) => 5 
  case CC_C(CC_C(CC_C(_, _), _), _) => 6 
}
}
// This is not matched: CC_C(CC_B(), _)