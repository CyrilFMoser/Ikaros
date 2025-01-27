package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Byte]], b: (T_B[(Char,Byte)],T_B[Int])) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_B(a: Boolean, b: Byte) extends T_A[T_A[T_A[(Boolean,Boolean)]]]
case class CC_C(a: T_A[T_A[CC_A]], b: (CC_A,Int)) extends T_A[T_A[T_A[(Boolean,Boolean)]]]

val v_a: T_A[T_A[T_A[(Boolean,Boolean)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}