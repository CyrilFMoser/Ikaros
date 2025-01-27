package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],T_B[(Int,Byte), T_A]), b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: CC_B) extends T_B[C, (T_B[CC_B, CC_A],CC_A)]
case class CC_D[D](a: T_B[D, D], b: T_A) extends T_B[D, (T_B[CC_B, CC_A],CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, _)) => 0 
  case CC_A((_,_), CC_B()) => 1 
  case CC_B() => 2 
}
}