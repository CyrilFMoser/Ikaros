package Program_13 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Int) extends T_A[(Char,Byte), T_B[(Char,Int)]]
case class CC_B[E](a: CC_A[E], b: CC_A[E]) extends T_A[(Char,Byte), T_B[(Char,Int)]]
case class CC_C[F]() extends T_B[F]
case class CC_D[G]() extends T_B[G]
case class CC_E(a: (Char,Int), b: T_B[Boolean], c: Char) extends T_B[CC_D[Boolean]]

val v_a: T_A[(Char,Byte), T_B[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _) => 1 
  case CC_B(_, CC_A(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (Tuple Char Byte) (T_B (Tuple Char Int))))
// This is not matched: (CC_A T_B (CC_B (CC_A Byte Wildcard (T_A Byte)) Wildcard T_B) (T_A T_B))