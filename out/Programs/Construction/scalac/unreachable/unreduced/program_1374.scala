package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: ((T_B,T_B),T_B), b: T_B, c: T_B) extends T_A[Char]
case class CC_B(a: T_B) extends T_A[Char]
case class CC_C(a: T_A[CC_B], b: ((CC_B,T_B),CC_B)) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[Char], b: T_A[CC_A], c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, (_,_)) => 0 
  case CC_D() => 1 
  case CC_E(CC_A(_, _, _), _, _) => 2 
  case CC_E(CC_B(_), _, _) => 3 
}
}