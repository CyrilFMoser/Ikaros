package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C](a: T_A, b: (T_B[T_A, Byte],T_A)) extends T_B[(T_B[CC_A, Int],T_B[(Char,Int), CC_A]), C]
case class CC_C[D](a: D) extends T_B[(T_B[CC_A, Int],T_B[(Char,Int), CC_A]), D]

val v_a: T_B[(T_B[CC_A, Int],T_B[(Char,Int), CC_A]), Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), (_,CC_A())) => 0 
  case CC_C(_) => 1 
}
}