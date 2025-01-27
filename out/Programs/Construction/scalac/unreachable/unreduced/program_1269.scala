package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Char) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_C() extends T_B[T_A[(Byte,Int)]]
case class CC_D(a: CC_B[T_A[CC_C]], b: (T_B[CC_C],Byte), c: Boolean) extends T_B[T_A[(Byte,Int)]]
case class CC_E(a: T_A[CC_C], b: T_B[Boolean]) extends T_B[T_A[(Byte,Int)]]

val v_a: T_B[T_A[(Byte,Int)]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, (_,_), _) => 1 
  case CC_E(CC_A(_, _), _) => 2 
}
}
// This is not matched: CC_E(CC_B(_, _), _)