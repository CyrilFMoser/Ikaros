package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C], c: Char) extends T_A[C]
case class CC_B() extends T_A[T_A[((Boolean,Byte),Int)]]
case class CC_C(a: (T_A[Int],T_A[CC_B]), b: CC_A[(CC_B,Char)], c: T_B[Char]) extends T_A[T_A[((Boolean,Byte),Int)]]
case class CC_D() extends T_B[T_A[T_A[CC_C]]]

val v_a: T_A[T_A[((Boolean,Byte),Int)]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_A(_, CC_C(_, _, _), _) => 2 
  case CC_B() => 3 
  case CC_C((_,_), CC_A(_, _, _), _) => 4 
}
}