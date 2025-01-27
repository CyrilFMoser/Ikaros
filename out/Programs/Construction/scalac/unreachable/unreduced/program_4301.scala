package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Char,Boolean)]], b: (T_A[Byte],Int)) extends T_A[T_A[T_A[(Byte,Byte)]]]
case class CC_B(a: (CC_A,T_A[Int])) extends T_A[T_A[T_A[(Byte,Byte)]]]
case class CC_C(a: T_A[CC_B], b: (CC_A,Int), c: CC_B) extends T_A[T_A[T_A[(Byte,Byte)]]]

val v_a: T_A[T_A[T_A[(Byte,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}