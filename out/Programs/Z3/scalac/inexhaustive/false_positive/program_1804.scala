package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B[B]() extends T_A[B]
case class CC_C[C]() extends T_A[C]
case class CC_D[D](a: (Char,CC_A), b: T_A[D], c: CC_C[D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(('x',CC_A(_, _)), CC_B(), CC_C()) => 0 
  case CC_D(('x',CC_A(_, _)), CC_A(_, _), CC_C()) => 1 
  case CC_D(('x',CC_A(_, _)), _, CC_C()) => 2 
  case CC_D((_,CC_A(_, _)), _, _) => 3 
  case CC_D(_, CC_C(), _) => 4 
  case CC_D((_,CC_A(_, _)), CC_B(), CC_C()) => 5 
  case CC_D(_, CC_B(), CC_C()) => 6 
  case CC_D(('x',CC_A(_, _)), CC_B(), _) => 7 
}
}
// This is not matched: (CC_D Boolean Wildcard Wildcard (CC_C Boolean (T_A Boolean)) T_B)
// This is not matched: (CC_A Int Wildcard Wildcard (T_A Int))