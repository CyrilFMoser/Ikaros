package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[(Int,(Char,Int)), T_B[Int, Boolean]]]
case class CC_B(a: T_B[Int, Char], b: (T_B[Byte, (Boolean,Boolean)],Byte)) extends T_A[T_B[(Int,(Char,Int)), T_B[Int, Boolean]]]
case class CC_C(a: T_A[CC_B], b: T_B[CC_A, CC_A]) extends T_A[T_B[(Int,(Char,Int)), T_B[Int, Boolean]]]
case class CC_D[D, E](a: T_B[D, E], b: D) extends T_B[Boolean, D]

val v_a: T_A[T_B[(Int,(Char,Int)), T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, (_,_)) => 1 
  case CC_C(_, _) => 2 
}
}