package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Char],T_A[Byte]), b: Boolean) extends T_A[Char]
case class CC_B(a: T_A[Char], b: Byte) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A((_,_), _), _) => 0 
  case CC_B(CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_A(_, _)