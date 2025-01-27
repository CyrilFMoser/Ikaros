package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Byte]], b: (T_A[Char],T_A[Int])) extends T_A[((Boolean,Char),Byte)]
case class CC_B() extends T_A[((Boolean,Char),Byte)]
case class CC_C() extends T_A[CC_A]

val v_a: T_A[((Boolean,Char),Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B() => 1 
}
}