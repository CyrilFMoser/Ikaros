package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: ((Int,Int),T_A[Int, Char]), c: (T_A[Boolean, Int],T_A[Byte, Byte])) extends T_A[C, T_A[T_A[Byte, Boolean], Boolean]]
case class CC_B() extends T_A[CC_A[CC_A[Byte]], T_A[T_A[Byte, Boolean], Boolean]]

val v_a: T_A[CC_A[CC_A[Byte]], T_A[T_A[Byte, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((_,_),_), (_,_)) => 0 
  case CC_B() => 1 
}
}