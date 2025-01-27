package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[(T_B[Int, Byte],T_B[Boolean, Int])]
case class CC_B[D](a: T_A[D], b: D) extends T_A[D]
case class CC_C(a: T_A[(CC_A,(Int,Char))], b: CC_B[T_A[CC_A]], c: CC_A) extends T_A[(T_B[Int, Byte],T_B[Boolean, Int])]
case class CC_D[E]() extends T_B[E, CC_C]

val v_a: T_A[(T_B[Int, Byte],T_B[Boolean, Int])] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_B(CC_B(CC_A(), (_,_)), _) => 1 
  case CC_B(CC_B(CC_B(_, _), (_,_)), _) => 2 
  case CC_B(CC_B(CC_C(_, _, _), (_,_)), _) => 3 
  case CC_B(CC_C(_, _, CC_A()), _) => 4 
  case CC_C(_, CC_B(CC_B(_, _), CC_B(_, _)), CC_A()) => 5 
}
}
// This is not matched: CC_A()