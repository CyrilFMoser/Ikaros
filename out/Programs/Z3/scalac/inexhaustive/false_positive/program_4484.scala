package Program_13 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Byte]]
case class CC_B[C, D](a: T_A[D], b: CC_A, c: T_A[C]) extends T_A[C]
case class CC_C[E](a: Int, b: E, c: CC_A) extends T_B[E]
case class CC_D[F](a: F, b: Int) extends T_B[F]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), CC_A(), _) => 0 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}
// This is not matched: (CC_B (T_A (T_A Byte))
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_A (T_A Byte))))
// This is not matched: (CC_B Byte
//      Wildcard
//      (CC_B Int (CC_A Int Wildcard (T_A Int)) Wildcard Wildcard (T_A Int))
//      (CC_B Byte
//            (CC_A Byte Wildcard (T_A Byte))
//            Wildcard
//            (CC_A Byte Char (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))