package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[Boolean],T_B), b: T_A[T_A[T_B]], c: (Char,Byte)) extends T_A[Byte]
case class CC_B(a: CC_A, b: CC_A) extends T_A[Byte]
case class CC_C(a: CC_B) extends T_A[Byte]
case class CC_D(a: T_A[(CC_B,Char)]) extends T_B
case class CC_E(a: T_A[Byte], b: CC_D, c: T_A[T_A[CC_A]]) extends T_B

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_D(_)), _, (_,_)) => 0 
  case CC_A((_,CC_E(_, _, _)), _, (_,_)) => 1 
  case CC_B(_, CC_A(_, _, _)) => 2 
  case CC_C(CC_B(_, _)) => 3 
}
}