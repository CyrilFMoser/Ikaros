package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, Char], b: Int, c: T_A[T_B[Byte, Byte]]) extends T_A[T_B[(Int,Byte), Char]]
case class CC_B(a: Byte) extends T_A[T_B[(Int,Byte), Char]]
case class CC_C(a: (T_A[CC_B],(CC_A,(Byte,Boolean)))) extends T_A[T_B[(Int,Byte), Char]]

val v_a: T_A[T_B[(Int,Byte), Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C((_,(_,_))) => 2 
}
}