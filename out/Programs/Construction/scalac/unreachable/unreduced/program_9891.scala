package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: CC_A, c: T_A[Byte]) extends T_A[Byte]
case class CC_C(a: T_B) extends T_B
case class CC_D(a: T_A[CC_C]) extends T_B
case class CC_E(a: (T_A[Byte],CC_C), b: (CC_D,T_A[Byte])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_))) => 1 
  case CC_C(CC_C(CC_E(_, _))) => 2 
  case CC_C(CC_D(_)) => 3 
  case CC_C(CC_E((_,_), (_,_))) => 4 
  case CC_D(_) => 5 
  case CC_E((CC_A(),CC_C(_)), _) => 6 
  case CC_E((CC_B(_, _, _),CC_C(_)), _) => 7 
}
}