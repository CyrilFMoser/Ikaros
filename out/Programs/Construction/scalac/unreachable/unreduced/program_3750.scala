package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Boolean, b: T_A[B], c: T_A[B]) extends T_A[Byte]
case class CC_B(a: (CC_A[Int],T_A[Byte])) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B((CC_A(_, _, _),CC_A(_, _, _))) => 1 
  case CC_B((CC_A(_, _, _),CC_B(_))) => 2 
}
}