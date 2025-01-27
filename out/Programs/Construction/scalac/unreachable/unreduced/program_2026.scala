package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: (T_A[Char],T_A[Int]), c: T_A[T_A[Int]]) extends T_A[T_A[((Byte,Byte),Byte)]]
case class CC_B(a: CC_A, b: CC_A, c: CC_A) extends T_A[T_A[((Byte,Byte),Byte)]]

val v_a: T_A[T_A[((Byte,Byte),Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_B(_, _, _) => 1 
}
}