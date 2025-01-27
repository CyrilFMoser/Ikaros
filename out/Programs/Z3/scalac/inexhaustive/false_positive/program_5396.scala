package Program_14 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, D]) extends T_A[C, D]
case class CC_B() extends T_A[CC_A[Boolean, (Int,Byte), Byte], T_A[(Byte,Byte), Char]]
case class CC_C[F](a: F) extends T_A[T_A[F, F], F]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Int Boolean Wildcard (T_A Char Int))
// This is not matched: (CC_C (T_A (T_A Char Char) Char))