package Program_14 

object Test {
sealed trait T_B[B]
case class CC_B[D]() extends T_B[D]
case class CC_D[F](a: T_B[F], b: Char) extends T_B[F]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), _) => 0 
}
}
// This is not matched: (CC_B Char
//      (CC_B Char (CC_B Char Wildcard Wildcard (T_A Char)) Int (T_A Char))
//      Int
//      (T_A Char))