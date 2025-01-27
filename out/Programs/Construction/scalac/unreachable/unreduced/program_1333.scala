package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Char, b: T_B[C], c: C) extends T_A[C]
case class CC_B() extends T_A[CC_A[Boolean]]
case class CC_C(a: CC_A[T_A[CC_B]], b: ((CC_B,CC_B),T_A[CC_B])) extends T_A[CC_A[Boolean]]
case class CC_D(a: Char) extends T_B[Boolean]

val v_a: T_A[CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), (_,_)) => 2 
}
}