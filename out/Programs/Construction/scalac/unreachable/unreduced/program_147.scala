package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Boolean, Byte],T_A[Int, Byte]), b: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Int) extends T_A[T_A[D, D], D]
case class CC_C(a: Byte) extends T_A[T_A[CC_A[T_A[Int, (Int,Byte)]], CC_A[T_A[Int, (Int,Byte)]]], CC_A[T_A[Int, (Int,Byte)]]]

val v_a: T_A[T_A[CC_A[T_A[Int, (Int,Byte)]], CC_A[T_A[Int, (Int,Byte)]]], CC_A[T_A[Int, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_) => 1 
  case CC_C(0) => 2 
  case CC_C(_) => 3 
}
}