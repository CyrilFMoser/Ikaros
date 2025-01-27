package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int) extends T_A[D]
case class CC_B[E](a: Boolean) extends T_B[T_B[Int, Boolean], T_A[(Char,Byte)]]
case class CC_C(a: CC_A[(Byte,Char)], b: (Boolean,Char)) extends T_B[T_B[Int, Boolean], T_A[(Char,Byte)]]

val v_a: T_B[T_B[Int, Boolean], T_A[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
  case CC_C(_, (_,'x')) => 2 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_B (T_B Int Boolean) (T_A (Tuple Char Byte))))
// This is not matched: (CC_B Boolean Wildcard (T_B (T_B Int Boolean) (T_A (Tuple Char Byte))))