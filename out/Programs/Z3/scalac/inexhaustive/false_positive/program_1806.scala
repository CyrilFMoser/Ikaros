package Program_29 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B[B]() extends T_A[B]
case class CC_C[C]() extends T_A[C]
case class CC_D[D](a: (Char,CC_A), b: T_A[D], c: CC_C[D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_D((_,CC_A(_, _)), CC_A(_, _), _) => 1 
  case CC_D((_,CC_A(_, _)), CC_C(), _) => 2 
  case CC_D(('x',CC_A(_, _)), CC_C(), CC_C()) => 3 
  case CC_D((_,CC_A(_, _)), CC_A(_, _), CC_C()) => 4 
}
}
// This is not matched: (CC_D Boolean Wildcard Wildcard (CC_C Boolean (T_A Boolean)) T_B)
// This is not matched: (CC_A Int Wildcard Wildcard (T_A Int))