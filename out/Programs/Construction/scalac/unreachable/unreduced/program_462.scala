package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (T_A[Char],T_A[Char])) extends T_A[D]
case class CC_B(a: T_A[Boolean], b: ((Boolean,Int),T_B[Byte, Char])) extends T_B[(Byte,(Boolean,Char)), Int]
case class CC_C(a: Boolean, b: CC_A[T_A[CC_B]]) extends T_B[(Byte,(Boolean,Char)), Int]

val v_a: T_B[(Byte,(Boolean,Char)), Int] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_)) => 0 
  case CC_C(true, _) => 1 
  case CC_C(false, _) => 2 
}
}