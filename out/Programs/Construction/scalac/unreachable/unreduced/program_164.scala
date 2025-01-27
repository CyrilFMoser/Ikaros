package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: (T_B[Char],(Char,Byte)), c: T_A[D, D]) extends T_A[D, T_A[T_A[Byte, Char], T_A[Byte, Int]]]
case class CC_B[E](a: Byte, b: T_B[E]) extends T_B[E]
case class CC_C(a: Int) extends T_B[CC_A[((Char,Boolean),Char)]]
case class CC_D(a: CC_A[CC_C], b: (CC_B[(Byte,Boolean)],T_A[Byte, (Byte,Boolean)])) extends T_B[CC_A[((Char,Boolean),Char)]]

val v_a: T_B[CC_A[((Char,Boolean),Char)]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C(_)) => 0 
  case CC_B(_, CC_D(_, _)) => 1 
  case CC_C(_) => 2 
  case CC_D(CC_A(_, _, _), (_,_)) => 3 
}
}
// This is not matched: CC_B(_, CC_B(_, _))