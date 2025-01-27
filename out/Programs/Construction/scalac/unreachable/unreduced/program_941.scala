package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_B[(Int,Boolean), (Char,Byte)])) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C[C](a: Byte) extends T_B[C, T_B[T_B[(Int,Byte), Char], T_B[T_A, T_A]]]
case class CC_D[D](a: (CC_C[CC_B],CC_B), b: Int, c: CC_A) extends T_B[D, T_B[T_B[(Int,Byte), Char], T_B[T_A, T_A]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_B(_) => 1 
}
}