package Program_31 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[Int, D]) extends T_A[D, Boolean]
case class CC_B[E, F](a: Boolean) extends T_B[E]
case class CC_C(a: CC_A[Char], b: (Boolean,Byte), c: (Byte,Int)) extends T_B[Int]
case class CC_D(a: T_A[CC_C, CC_C], b: Char, c: ((Char,Boolean),CC_C)) extends T_B[Int]

val v_a: T_B[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B (T_B Int) Boolean Wildcard (T_B (T_B Int)))
// This is not matched: (CC_B T_A)