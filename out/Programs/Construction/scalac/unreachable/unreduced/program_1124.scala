package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[(Int,Int)]]
case class CC_B(a: T_B[T_A[CC_A]], b: (T_A[CC_A],Boolean)) extends T_A[T_B[(Int,Int)]]
case class CC_C(a: CC_B, b: T_A[Char], c: (CC_B,((Char,Byte),CC_B))) extends T_B[CC_A]
case class CC_D[C](a: T_B[C], b: T_A[C]) extends T_B[CC_A]

val v_a: T_A[T_B[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_)) => 1 
}
}