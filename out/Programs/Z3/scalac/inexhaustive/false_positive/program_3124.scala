package Program_15 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Char) extends T_A[T_A[Boolean, (Char,Byte)], D]
case class CC_B[E](a: CC_A[E]) extends T_A[T_A[Boolean, (Char,Byte)], E]
case class CC_C(a: T_A[Byte, Boolean], b: Char, c: T_A[Int, Byte]) extends T_A[T_A[Boolean, (Char,Byte)], CC_B[Byte]]
case class CC_D[F]() extends T_B[F]
case class CC_E[G, H](a: H, b: CC_A[H]) extends T_B[G]

val v_a: T_A[T_A[Boolean, (Char,Byte)], Int] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_E(_, _), 'x') => 1 
  case CC_A(CC_E(_, _), _) => 2 
  case CC_A(CC_D(), _) => 3 
}
}
// This is not matched: (CC_A Int
//      (CC_E Int Boolean Boolean Wildcard (T_B Int))
//      Wildcard
//      (T_A (T_A Boolean (Tuple Char Byte)) Int))
// This is not matched: (CC_A Boolean Byte Boolean (T_A Boolean Byte))