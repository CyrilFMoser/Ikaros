package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[Char]]
case class CC_B[E](a: T_B[E], b: CC_A[Byte], c: E) extends T_A[E, T_B[Char]]
case class CC_C[F, G](a: F) extends T_A[F, T_B[Char]]

val v_a: T_A[Byte, T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
  case CC_B(_, CC_A(), _) => 2 
}
}
// This is not matched: (CC_C Byte Boolean Byte (T_A Byte (T_B Char)))
// This is not matched: (CC_B Byte (T_A Byte Byte) (T_A Byte (T_A Byte Byte)))