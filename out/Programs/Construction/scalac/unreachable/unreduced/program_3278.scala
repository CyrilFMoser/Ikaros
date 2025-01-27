package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[Char, C]
case class CC_B() extends T_B
case class CC_C(a: (CC_A[Int],T_B), b: T_A[CC_A[Byte], T_A[CC_B, (Boolean,Char)]], c: Int) extends T_B
case class CC_D(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C((CC_A(_),CC_C(_, _, _)), _, _) => 1 
  case CC_C((CC_A(_),CC_D(_)), _, _) => 2 
  case CC_D(CC_B()) => 3 
  case CC_D(CC_C(_, _, _)) => 4 
  case CC_D(CC_D(CC_B())) => 5 
  case CC_D(CC_D(CC_C(_, _, _))) => 6 
  case CC_D(CC_D(CC_D(_))) => 7 
}
}
// This is not matched: CC_C((CC_A(_),CC_B()), _, _)