package Program_19 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, Byte],T_B[T_A, T_A]), b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: Byte) extends T_B[Int, C]
case class CC_D(a: CC_B, b: (T_A,T_B[Boolean, CC_B])) extends T_B[CC_A, Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A((_,_), _)) => 0 
  case CC_A((_,_), CC_B()) => 1 
  case CC_B() => 2 
}
}