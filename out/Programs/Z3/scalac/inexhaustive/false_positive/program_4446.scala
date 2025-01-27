package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D, E](a: CC_A[D], b: T_B[(Byte,Byte)], c: CC_A[E]) extends T_B[D]
case class CC_C[F](a: T_A[F], b: Int, c: T_B[F]) extends T_B[F]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_C(_, _, _), CC_A()) => 0 
  case CC_B(_, _, _) => 1 
  case CC_B(CC_A(), _, CC_A()) => 2 
  case CC_B(CC_A(), _, _) => 3 
  case CC_B(CC_A(), CC_B(_, _, _), _) => 4 
  case CC_B(_, CC_C(_, _, _), _) => 5 
  case CC_C(_, _, CC_C(_, _, _)) => 6 
  case CC_C(_, _, _) => 7 
  case CC_C(_, 12, CC_C(_, _, _)) => 8 
  case CC_C(CC_A(), 12, _) => 9 
  case CC_C(CC_A(), _, CC_C(_, _, _)) => 10 
}
}
// This is not matched: (CC_B Int (CC_A Boolean Boolean) Wildcard Wildcard Wildcard (T_B Int))
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A Byte))