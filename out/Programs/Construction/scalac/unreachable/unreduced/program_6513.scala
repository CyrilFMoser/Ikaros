package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[((Char,Byte),Int)]]
case class CC_B(a: CC_A, b: T_A[CC_A], c: T_A[Int]) extends T_A[T_A[((Char,Byte),Int)]]
case class CC_C(a: Byte) extends T_A[CC_A]

val v_a: T_A[T_A[((Char,Byte),Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_C(_), _) => 1 
}
}