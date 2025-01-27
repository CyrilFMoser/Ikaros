package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_A[Boolean], c: T_A[((Byte,Boolean),CC_A)]) extends T_A[Byte]
case class CC_C(a: (CC_A,CC_A)) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C((_,_))) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C((CC_A(_),CC_A(_))) => 6 
}
}